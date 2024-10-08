public class Engineer extends Info{
    private String major;
    public Engineer(String fullname,int age,String gender,String major){
        super(fullname,age,gender);
        this.major = major;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void getInformation(){
        System.out.println("Họ và tên: "+this.getFullname());
        System.out.println("Tuổi: "+this.getAge());
        System.out.println("Giới tính: "+this.getGender());
        System.out.println("Công việc: "+this.getMajor());
    }
}
