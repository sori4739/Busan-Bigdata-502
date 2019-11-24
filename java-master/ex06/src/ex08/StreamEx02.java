package ex08;

import java.io.InputStream;

/**
 * 스트림은 수도꼭지, 수도꼭지를 틀면 물이 나오고,잠그면 물이 나오지 않음.
 * A - B 까지 통신을 하렴녀!! 스트림이 필요!!
 * 물의 흐름 = 스트림(Stream)
 * 
 * @author it
 *
 */
public class StreamEx02 {
	public static void main(String[] args) {
		//키보드로 부터 연결된 바이트 스트림 객체
		InputStream in = System.in;
		//in 에 입력된값이 리드로 읽혀 리턴타입인 인트로 나온다 아스키 코드 숫자.
		try {
			int inData = in.read();//리드 리턴타입 int , 아스키 코드 ,리드는 1byte만 받는다.
			System.out.println(inData);
			char c = (char)inData;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
