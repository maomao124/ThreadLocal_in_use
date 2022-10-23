package mao;

/**
 * Project name(项目名称)：ThreadLocal的使用
 * Package(包名): mao
 * Class(类名): Test4
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/23
 * Time(创建时间)： 12:58
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test4
{
    public static void main(String[] args)
    {
        User user = new User().setId(12L).setName("张三");
        User user2 = new User().setId(14L).setName("李四");
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                UserHolder.setUser(user);

                System.out.println(UserHolder.getUser());

                UserHolder.removeUser();
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                UserHolder.setUser(user2);

                System.out.println(UserHolder.getUser());

                UserHolder.removeUser();
            }
        }).start();
    }
}
