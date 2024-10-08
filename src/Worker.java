public class Worker extends Info{
    private int level;
    public Worker(String fullname,int age,String gender,int level){
        super(fullname,age,gender);
        this.level = level;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void getInformation(){
        System.out.println("Họ và tên: "+this.getFullname());
        System.out.println("Tuổi: "+this.getAge());
        System.out.println("Giới tính: "+this.getGender());
        System.out.println("Cấp độ: "+this.getLevel());
    }
}