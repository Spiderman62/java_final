import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Employed> employedLists = new ArrayList<>();
    ArrayList<Worker> workerLists = new ArrayList<>();

    ArrayList<Engineer> engineerLists = new ArrayList<>();
    public void addPerson(){
        String fullname,gender,major;
        int age,level;
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy chọn nguồn nhân lực mà bạn muốn thêm!");
        System.out.println("1: Thêm nhân viên");
        System.out.println("2: Thêm công nhân");
        System.out.println("3: Thêm kỹ sư");
        System.out.println("Nhấn số phía trên để thực hiện chọn lọc!");
        int type = input.nextInt();
        input.nextLine();
        switch (type){
            case 1:
                System.out.print("Nhập họ và tên: ");
                fullname = input.nextLine();
                System.out.print("Nhập tuổi: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Nhập giới tính: ");
                gender = input.nextLine();
                System.out.print("Nhập công việc: ");
                major = input.nextLine();
                Employed employed = new Employed(fullname,age,gender,major);
                employedLists.add(employed);
                break;
            case 2:
                System.out.print("Nhập họ và tên: ");
                fullname = input.nextLine();
                System.out.print("Nhập tuổi: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Nhập giới tính: ");
                gender = input.nextLine();
                System.out.print("Nhập cấp độ: ");
                level = input.nextInt();
                Worker worker = new Worker(fullname,age,gender,level);
                workerLists.add(worker);
                break;
            case 3:
                System.out.print("Nhập họ và tên: ");
                fullname = input.nextLine();
                System.out.print("Nhập tuổi: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Nhập giới tính: ");
                gender = input.nextLine();
                System.out.print("Nhập công việc: ");
                major = input.nextLine();
                Engineer engineer = new Engineer(fullname,age,gender,major);
                engineerLists.add(engineer);
                break;

        }
    }
    public void searchPerson(){
        int i;
        String fullname;
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy chọn nguồn nhân lực mà bạn muốn tìm kiếm!");
        System.out.println("1: Tìm nhân viên");
        System.out.println("2: Tìm công nhân");
        System.out.println("3: Tìm kỹ sư");
        System.out.println("Nhấn số phía trên để thực hiện chọn lọc!");
        int type = input.nextInt();
        input.nextLine();

        switch (type){
            case 1:
                System.out.print("Nhập họ và tên: ");
                fullname = input.nextLine();
                for(i = 0;i<employedLists.size();i++){
                    if(employedLists.get(i).getFullname().equals(fullname)){
                         employedLists.get(i).getInformation();
                    };

                }
                break;
            case 2:
                System.out.print("Nhập họ và tên: ");
                fullname = input.nextLine();
                for(i = 0;i<workerLists.size();i++){
                    if(workerLists.get(i).getFullname().equals(fullname)){
                        workerLists.get(i).getInformation();
                    };

                }
                break;
            case 3:
                System.out.print("Nhập họ và tên: ");
                fullname = input.nextLine();
                for(i = 0;i<engineerLists.size();i++){
                    if(engineerLists.get(i).getFullname().equals(fullname)){
                        engineerLists.get(i).getInformation();
                    };
                }
                break;
        }
    }
    public void getInforPerson(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy chọn nguồn nhân lực mà bạn muốn in ra danh sách!");
        System.out.println("1: Danh sách nhân viên");
        System.out.println("2: Danh sách công nhân");
        System.out.println("3: Danh sách kỹ sư");
        System.out.println("Nhấn số phía trên để thực hiện chọn lọc!");
        int type = input.nextInt();
        int i;
        switch (type){
            case 1:
            for(i = 0;i<employedLists.size();i++){
                employedLists.get(i).getInformation();
            }
            break;
            case 2:
                for(i = 0;i<workerLists.size();i++){
                    workerLists.get(i).getInformation();
                }
                break;
            case 3:
                for(i = 0;i<engineerLists.size();i++){
                    engineerLists.get(i).getInformation();
                }
                break;
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Main main = new Main();
        boolean alwaysLoop = true;
        int action = 0;
        while(alwaysLoop){
            System.out.println("Chào mừng bạn đến với chương trình quản lý nhân lực");
            System.out.println("1: Thêm 1 người mới");
            System.out.println("2: Tìm kiếm theo họ tên");
            System.out.println("3: Hiển thị danh sách thông tin");
            System.out.println("Hoặc nhập số bất kỳ để huỷ!");
            System.out.print("Nhập số phía trên để thực hiện chương trình: ");
            action = input.nextInt();
            switch (action){
                case 1:
                    main.addPerson();
                    break;
                case 2:
                    main.searchPerson();
                    break;
                    case 3:
                    main.getInforPerson();
                    break;
                default:
                    alwaysLoop = false;
                    break;
            }
        }
    }
}