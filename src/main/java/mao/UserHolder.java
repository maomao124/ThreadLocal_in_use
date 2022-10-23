package mao;

/**
 * Project name(项目名称)：ThreadLocal的使用
 * Package(包名): mao
 * Class(类名): UserHolder
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/23
 * Time(创建时间)： 13:00
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class UserHolder
{
    private static final ThreadLocal<User> threadLocal = new ThreadLocal<>();

    /**
     * 获取用户对象
     *
     * @return {@link User}
     */
    public static User getUser()
    {
        return threadLocal.get();
    }

    /**
     * 往ThreadLocal存取用户对象
     *
     * @param user 用户
     */
    public static void setUser(User user)
    {
        threadLocal.set(user);
    }

    /**
     * 从ThreadLocal里删除用户对象
     */
    public static void removeUser()
    {
        threadLocal.remove();
    }
}
