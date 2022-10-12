public class Collaborator {

    private String fName;
    private String mName;
    private String lName;
    private String post;
    private String mail;
    private int numOfPhone;
    private int age;

    public Collaborator(String fName, String mName, String lName, String post, String mail, int numOfPhone, int age) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.post = post;
        this.mail = mail;
        this.numOfPhone = numOfPhone;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getNumOfPhone() {
        return numOfPhone;
    }

    public void setNumOfPhone(int numOfPhone) {
        this.numOfPhone = numOfPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
