package programmers;

public class _17682 {

	public static void main(String[] args) {
		String str = "1S2D*3T";
		
		int[] result = new int[3];
		char[] arr = str.toCharArray();
		int answer = 0;
		int idx = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= '0' && arr[i] <= '9') {	// ����
				idx++;
				if(arr[i] == '1' && arr[i+1] == '0') {	// ������ 10������ Ȯ��
					result[idx] = 10;
					i++;
				}else {
					result[idx] = arr[i] - '0';
				}
			}else if(arr[i] == 'D') {	// ���ʽ��� D�� ��� 2����
				result[idx] = (int) Math.pow(result[idx], 2);
			}else if(arr[i] == 'T') {	// ���ʽ��� T�� ��� 3����, S�� 1�����̱� ������ �ۼ�X
				result[idx] = (int) Math.pow(result[idx], 3);
			}else if(arr[i] == '*') {	// �ɼ��� *�� ��� 
				if(idx > 0) {			
					result[idx - 1] *= 2;	// ���������� �ִٸ� ���� ������ �ش� ���� ��� 2��
				}
				result[idx] *= 2;
			}else if(arr[i] == '#') {
				result[idx] *= -1;			// �ɼ��� #�� ��� �ش� ���� ���̳ʽ�
			}
		}
		
		for(int value : result) {
			answer += value;
		}
		System.out.println(answer);
	}
}
