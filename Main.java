package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WiseSaying[] sayings = new WiseSaying[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        int num = 0;
        int lastIndex = 0;
        while(true){
            System.out.print("명령) ");
            String command = scanner.nextLine();

            if(command.equals("등록")){
                WiseSaying saying = new WiseSaying();
                System.out.print("명언 : ");
                saying.wise = scanner.nextLine();
                System.out.print("작가 : ");
                saying.author = scanner.nextLine();
                num = num + 1;
                saying.wiseNum = num;
                sayings[lastIndex] = saying;
                lastIndex++;
                System.out.printf("%d번 명언이 등록되었습니다.\n", num);

            }else if(command.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-------------------------");
                for(int i = lastIndex - 1; i >= 0; i--){
                    System.out.printf("%d / %s / %s\n", sayings[i].wiseNum, sayings[i].author, sayings[i].wise);
                }
            } else if(command.equals("삭제?id=1")){
                for(int i = 0; i + 1 < sayings.length; i++){ // i의 초기값 i = lastIndex로 수정 예정
                    sayings[i].wiseNum = sayings[i+1].wiseNum;
                    sayings[i].wise = sayings[i+1].wise;
                    sayings[i].author = sayings[i+1].author;

                }
            }else if(command.equals("종료")){
                break;
            }
        }
        scanner.close();
    }
}