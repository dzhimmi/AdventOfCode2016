package Day2;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
	static final String test1 = "ULL ";
	static final String test2 = "RRDDD ";
	static final String test3 = "LURDL ";
	static final String test4 = "UUUUD ";

    static final String data1 = "RRLUDDLDUDUDUDRDDDRDDRLUUUDRUDURURURLRDDULLLDRRRRULDDRDDURDLURLURRUULRURDDDDLDDRRLDUDUUDURURDLDRRURDLLLDLLRUDRLDDRUULLLLLRRLDUDLUUDRUULLRLLLRLUURDLDLLDDRULDLUURRURLUUURLLDDULRDULULRULDDLRDDUUDLRRURLLURURLDDLURRLUURRRRLDRDLDUDRUDDRULLDUDDLRRLUUUUUDDLLDRLURDDRLLUDULDRDDLLUURUUUURDRLRLLULUULULLRRDLULRUDURDLRLRDDDRULLUULRURULLLUDUURUUUURUULDURDRRRULRLULDLRRULULUUDDDRDURLLURLLDUUUUDULRDLRDUUDDLDUDRLLRLRRRLULUDDDURLRRURUDDDRDRDRLLRDRDLDDRRDRDLLRLLLRRULRDDURRDUDRURDLDULLRRLURLRLLDURRRLLDRRURRRUULDRLDUULRDLDLURUDLLDLLUUDDDUUUDRL\n" +
            "DLRRDRRDDRRDURLUDDDDDULDDLLDRLURDDDDDDRDDDRDDDLLRRULLLRUDULLDURULRRDLURURUDRUURDRLUURRUDRUULUURULULDDLLDDRLDUDDRDRDDUULDULDDLUDUDDUDLULLUDLLLLLRRRUURLUUUULRURULUDDULLLRLRDRUUULULRUUUULRDLLDLDRDRDRDRRUUURULDUUDLDRDRURRUDDRLDULDDRULRRRLRDDUUDRUDLDULDURRDUDDLULULLDULLLRRRDULLLRRURDUURULDRDURRURRRRDLDRRUDDLLLDRDRDRURLUURURRUUURRUDLDDULDRDRRURDLUULDDUUUURLRUULRUURLUUUDLUDRLURUDLDLDLURUURLDURDDDDRURULLULLDRDLLRRLDLRRRDURDULLLDLRLDR ";
    static final String data2 = "URURLLDRDLULULRDRRDDUUUDDRDUURULLULDRLUDLRUDDDLDRRLURLURUUDRLDUULDRDURRLLUDLDURRRRLURLDDRULRLDULDDRRLURDDRLUDDULUDULRLDULDLDUDRLLDDRRRDULLDLRRLDRLURLUULDDDDURULLDLLLDRRLRRLLRDDRDLDRURRUURLLDDDLRRRRRDLRRDRLDDDLULULRLUURULURUUDRULRLLRDLDULDRLLLDLRRRUDURLUURRUDURLDDDRDRURURRLRRLDDRURULDRUURRLULDLUDUULDLUULUDURRDDRLLLRLRRLUUURRDRUULLLRUUURLLDDRDRULDULURRDRURLRRLRDURRURRDLDUDRURUULULDDUDUULDRDURRRDLURRLRLDUDRDULLURLRRUDLUDRRRULRURDUDDDURLRULRRUDUUDDLLLURLLRLLDRDUURDDLUDLURDRRDLLRLURRUURRLDUUUUDUD ";
    static final String data3 = "DRRDRRRLDDLDUDRDLRUUDRDUDRRDUDRDURRDDRLLURUUDRLRDDULLUULRUUDDRLDLRULDLRLDUDULUULLLRDLURDRDURURDUDUDDDRRLRRLLRULLLLRDRDLRRDDDLULDLLUUULRDURRULDDUDDDURRDRDRDRULRRRDRUDLLDDDRULRRLUDRDLDLDDDLRLRLRLDULRLLRLRDUUULLRRDLLRDULURRLDUDDULDDRLUDLULLRLDUDLULRDURLRULLRRDRDDLUULUUUULDRLLDRDLUDURRLLDURLLDDLLUULLDURULULDLUUDLRURRRULUDRLDRDURLDUDDULRDRRDDRLRRDDRUDRURULDRRLUURUDULDDDLRRRRDRRRLLURUURLRLULUULLRLRDLRRLLUULLDURDLULURDLRUUDUUURURUURDDRLULUUULRDRDRUUDDDRDRL ";
    static final String data4 = "RLRUDDUUDDDDRRLRUUDLLDRUUUDRRDLDRLRLLDRLUDDURDLDUDRRUURULLRRLUULLUDRDRUDDULRLLUDLULRLRRUUDLDLRDDDRDDDUDLULDLRRLUDUDDRRRRDRDRUUDDURLRDLLDLDLRRDURULDRLRRURULRDDLLLRULLRUUUDLDUURDUUDDRRRDDRLDDRULRRRDRRLUDDDRUURRDRRDURDRUDRRDLUDDURRLUDUDLLRUURLRLLLDDURUDLDRLRLLDLLULLDRULUURLDDULDDRDDDURULLDRDDLURRDDRRRLDLRLRRLLDLLLRDUDDULRLUDDUULUDLDDDULULDLRDDLDLLLDUUDLRRLRDRRUUUURLDLRRLDULURLDRDURDDRURLDLDULURRRLRUDLDURDLLUDULDDU ";

	static List<String> l = new ArrayList<>(5);
    static List<Integer> c = new ArrayList<>();
	static int x = 0;
	static int y = 0;
	static int index = 0;
	public static void main(String[] args) {
		l.add(0,test1);
		l.add(1,test2);
		l.add(2,test3);
		l.add(3,test4);
		l.add(4,"");
		while(index < 4){
			System.out.println(l.get(index));
			for(int i = 0;i<l.get(index).length();++i){
				switch (l.get(index).charAt(i)){
					case 'U':
						if(y<1 && y>=-1){
							System.out.println("Up");
							++y;
						}
						else {
							System.out.println("Skipping Up");
						}break;
					case 'D':
						if(y<=1 && y>-1){
							System.out.println("Down");
							--y;
						}
						else{
							System.out.println("Skipping Down");
						}break;
					case 'R':
						if(x<1 && x>=-1){
							System.out.println("Right");
							++x;
						}
						else{
							System.out.println("Skipping Right");
						}break;
					case 'L':
						if(x<=1 && x>-1){
							System.out.println("Left");
							--x;
						}
						else{
							System.out.println("Skipping Left");
						}break;
				}
			}
			if(x == -1 && y == 1) {
                System.out.println("Digit - 1");
                c.add(1);
            }
            else if(x == 0 && y == 1){
                System.out.println("Digit - 2");
                c.add(2);
            }
            else if(x == 1 && y == 1){
                System.out.println("Digit - 3");
                c.add(3);
            }
            else if(x == -1 && y == 0){
                System.out.println("Digit - 4");
                c.add(4);
            }
            else if(x == 0 && y == 0){
                System.out.println("Digit - 5");
                c.add(5);
            }
            else if(x == 1 && y == 0){
                System.out.println("Digit - 6");
                c.add(6);
            }
            else if(x == -1 && y == -1){
                System.out.println("Digit - 7");
                c.add(7);
            }
            else if(x == 0 && y == -1){
                System.out.println("Digit - 8");
                c.add(8);
            }
            else if(x == 1 && y == -1){
                System.out.println("Digit - 9");
                c.add(9);
            }
            else{
                System.out.println("Something went horribly wrong in the if array!");
            }
            System.out.println(Integer.toString(x) + "\n" + Integer.toString(y));
			++index;
		}
        System.out.println(c);
    }
}
