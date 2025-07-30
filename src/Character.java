public abstract class Character implements Creature{
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public final boolean isAlive() {
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void showStatus(){
        System.out.println(this.getName() + ":HP" + this.getHp());
    }
    
    public String getName(){
        return this.name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            this.hp = 0;
        }else{
            this.hp = hp;
        }
    }
}
