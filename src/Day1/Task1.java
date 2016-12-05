package Day1;

public class Task1
{
	public static void main(String[] args) {
		final int NORTH = 0;
		final int EAST = 1;
		final int SOUTH = 2;
		final int WEST = 3;
		int face = NORTH;

		String[] inp = "L2, L5, L5, R5, L2, L4, R1, R1, L4, R2, R1, L1, L4, R1, L4, L4, R5, R3, R1, L1, R1, L5, L1, R5, L4, R2, L5, L3, L3, R3, L3, R4, R4, L2, L5, R1, R2, L2, L1, R3, R4, L193, R3, L5, R45, L1, R4, R79, L5, L5, R5, R1, L4, R3, R3, L4, R185, L5, L3, L1, R5, L2, R1, R3, R2, L3, L4, L2, R2, L3, L2, L2, L3, L5, R3, R4, L5, R1, R2, L2, R4, R3, L4, L3, L1, R3, R2, R1, R1, L3, R4, L5, R2, R1, R3, L3, L2, L2, R2, R1, R2, R3, L3, L3, R4, L4, R4, R4, R4, L3, L1, L2, R5, R2, R2, R2, L4, L3, L4, R4, L5, L4, R2, L4, L4, R4, R1, R5, L2, L4, L5, L3, L2, L4, L4, R3, L3, L4, R1, L2, R3, L2, R1, R2, R5, L4, L2, L1, L3, R2, R3, L2, L1, L5, L2, L1, R4".replace(",","").split(" ");
		int dX = 0, dY = 0;
		for(String s:inp){
			if(s.charAt(0) == 'R'){
				if(face == WEST){
					face = NORTH;
				}
				else{
					++face;
				}
			}
			else{
				if(face == NORTH){
					face = WEST;
				}
				else{
					--face;
				}
			}
			String numString = s.substring(1);
			int steps = Integer.parseInt(numString);
			switch(face){
				case NORTH:
					dY += steps;
					break;
				case EAST:
					dX += steps;
					break;
				case SOUTH:
					dY -= steps;
					break;
				case WEST:
					dX -= steps;
					break;
			}
		}
	}
}
