public class Country {
    private String name;
    private String capital;
    private long population;
    public Country(String name){ this.name = name; } //this는 왜 쓰는 걸까? 이 경우는 변수 구분
    public String getName(){ return name; }
    public void setName(String name) {this.name = name;}
    public String getCapital() {return capital;}
    public void setCapital(String capital) {this.capital = capital;}
    public long getPopulation() { return population; }
    public void setPopulation(long population) {this.population = population; }
    public String toString(){
        return name + "{ capital" + "="+capital +",population="+ population+"}";
    }
    public boolean equals(Object obj){
        Country p=(Country)obj;
        if(name==p.name&capital==p.capital)return true;
        else return false;
        }
}

class HW8{
    public static void main(String args[]){
        Country Kor=new Country("Korea");
        Kor.setCapital("Seoul");
        Kor.setPopulation(50000000);
        Country Kor1=new Country("Korea");
        Kor1.setCapital("Seoul");
        Kor1.setPopulation(50000000);


        System.out.println(Kor.getName());
        System.out.println(Kor.getCapital());
        System.out.println(Kor.getPopulation());

        System.out.println(Kor);// String to String의 동작 조건이 궁금함. 그냥 객체 출력하면 나오는 거? Kor는 Kor.toString()으로 자동변환
        System.out.println(Kor1);

        if (Kor.equals(Kor1))
            System.out.println("Kor객체와 Korea객체는 동일한 객체 입니다");
        else
            System.out.println("Kor객체와 Korea객체는 상이한 객체 입니다");

    }
}
