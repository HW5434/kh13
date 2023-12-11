package CONDITION2;

import java.util.Scanner;

public class Test06날짜출력 {

	public static void main(String[] args) {

			/*SNS에서는 작성한 글이 몇 초 전에 작성되었는지에 따라 다음과 같이
			   출력하도록 구성되어 있습니다.
			   사용자가 초를 입력하면 입력된 값에 따라 시간 정보를 출력해보세요
			
				
		   *방금전 : 작성한 지 10초가 되지 않은 글
			?초전 : 작성한지 10초 이상 1분이 되지 않은 글
			?분전 : 작성한 지 1분 이상 1시간 미만인 글
			?시간 전 : 작성한 지 1시간 이상 1일 미만인 글
			?일 전 : 작성한 지 1일 이상인 글*/
			
			// 시간 분 초 사용자 초를 입력하면 값에 따라 시간정보

			//입력
			Scanner sc = new Scanner(System.in);
			System.out.print("업로드한 '초'을 말씀해주세요 : ");
			
			int UserS = sc.nextInt();
			System.out.println();
			
			//계산
			int M = 60;
			int H = 60 * M;
			int D = H * 24;
			
			//시간 , 분 , 초
			int Day = (UserS / 3600) / 24;
			int Hour = UserS / 3600;
			int Minute = UserS / 60;
			
			if(10 > UserS)	{	
			System.out.println("방금전 작성한 글입니다.");
			}
			else if(10 <= UserS && UserS < M) {
			System.out.println(UserS + "초 전 글입니다.");
			}
			else if(M < UserS && UserS < H) {	
			System.out.println(Minute + "분 전 글입니다.");
			}
			else if(H < UserS && UserS < D) {		
			System.out.println(Hour + "시간 전 글입니다.");
			}
			else {
				System.out.println(Day + "일 전 글입니다.");	
				
			}			
		}
	}

