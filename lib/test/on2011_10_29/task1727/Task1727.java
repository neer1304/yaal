package on2011_10_29.task1727;



import net.egork.numbers.IntegerUtils;
import net.egork.utils.io.InputReader;
import net.egork.utils.io.OutputWriter;

import java.util.*;

public class Task1727 {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		Random rnd = new Random(239);
		int sum = in.readInt();
		Set<Integer> was = new HashSet<Integer>();
		List<Integer> answer = new ArrayList<Integer>();
		while (sum > 17) {
			int next = rnd.nextInt(99990) + 10;
			if (was.contains(next))
				continue;
			int sumDigits = IntegerUtils.sumDigits(Integer.toString(next));
			if (sumDigits <= sum) {
				answer.add(next);
				sum -= sumDigits;
				was.add(next);
			}
		}
		if (sum > 9) {
			answer.add(9);
			sum -= 9;
		}
		if (sum > 0) {
			answer.add(sum);
		}
		out.printLine(answer.size());
		out.printLine(answer.toArray());
	}
}