package firstjava;

import java.io.IOException;

public class Miro {
    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {}
        int[][] map = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
        };
        var current = new Position(1, 1);
        var goal = new Position(4, 3);
        for (;;) {
// 미로 표시
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    if (x == current.x() && y == current.y()) {
                        System.out.print("o"); }
                    else if (map[y][x] == 1) {
                        System.out.print("*"); }
                    else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
// Goal 결정
            if (current.equals(goal)) {
                System.out.println("GOAL!");
                break;
            }
// 키입력
            int ch = System.in.read();
// 눌려진 방향 좌표 얻기
        var next = switch (ch) {
            case 'a' ->
                    new Position(current.x() - 1, current.y());
            case 'w' ->
                    new Position(current.x(), current.y() - 1);
            case 's' ->
                    new Position(current.x() + 1, current.y());
            case 'z' ->
                    new Position(current.x(), current.y() + 1);
            default ->
                    current;
        };
        // 누른 방향이 통로라면 진행
            if (map[next.y()][next.x()] == 0) {
                current = next;
            }
        // 엔터키 입력을 버립니다.
            System.in.read(); }
    }
}
