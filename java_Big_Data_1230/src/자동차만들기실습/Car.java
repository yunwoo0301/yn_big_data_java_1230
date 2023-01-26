package 자동차만들기실습;

public abstract class Car {
    protected int speed; // 속도
    protected int mileage; // 연비
    protected int tank; // 오일탱크
    protected int seats; // 좌석수
    protected String name; // 차량명


    }
    class SportsCar extends Car {
        private boolean isTurbo;
        SportsCar(String name) {
            int mileage = 8;
            speed = 250;
            tank = 30;
            seats = 2;
            this.name = name;
            isTurbo = false;
        }
        int getSpeed() {
            if(isTurbo) return speed *=1.2;
            return speed;
        }
        void infoSportsCar() {
            System.out.println("연비 : " + mileage);
            System.out.println("속도 : " + speed);
            System.out.println("연료탱크크기 : " + tank);
            System.out.println("좌석수 : " + seats );
            System.out.println("터보기능 : " + isTurbo);
        }

    }
    class MiNi extends Car {
    private boolean isTrunk;
        MiNi(String name) {
            int mileage = 12;
            speed = 200;
            tank = 45;
            seats = 4;
            this.name = name;
            isTrunk = false;
        }
            boolean getTrunk() {
            return isTrunk;
        }
        void infoMiNi() {
            System.out.println("연비 : " + mileage);
            System.out.println("속도 : " + speed);
            System.out.println("연료탱크크기 : " + tank);
            System.out.println("좌석수 : " + seats );
            System.out.println("트렁크기능 : " + isTrunk);
        }
    }
    class Bus extends Car {
          Bus(String name) {
            int mileage = 5;
            speed = 150;
            tank = 100;
            seats = 20;
            this.name = name;
        }

          boolean isTank = false;
          void fuc(int tank) {
            if (tank == 1)
                isTank = true;
            tank += 30;

        }

            void infoBus() {
                System.out.println("연비 : " + mileage);
                System.out.println("속도 : " + speed);
                System.out.println("연료탱크크기 : " + tank);
                System.out.println("좌석수 : " + seats);
                System.out.println("보조연료탱크 : " + tank);


                }
            }











