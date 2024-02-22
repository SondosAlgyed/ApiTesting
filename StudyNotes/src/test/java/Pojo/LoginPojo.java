package Pojo;

public class LoginPojo
{
    private String name;
    private String email;

    public LoginPojo( String name,String email)
    {
        this.email=email ;
        this.name=name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
