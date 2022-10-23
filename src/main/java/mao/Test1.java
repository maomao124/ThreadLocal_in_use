package mao;

/**
 * Project name(项目名称)：ThreadLocal的使用
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/23
 * Time(创建时间)： 12:48
 * Version(版本): 1.0
 * Description(描述)： 测试隔离
 */

public class Test1
{

    private static final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();


    public static void main(String[] args)
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                threadLocal.set(1);
                System.out.println("线程1设置值为1");
                try
                {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("线程1取值：" + threadLocal.get());
                threadLocal.remove();
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("线程2取值：" + threadLocal.get());
            }
        }).start();
    }
}
