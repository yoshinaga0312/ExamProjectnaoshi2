public abstract class Monster implements Creature{
    String name;
    int hp;
    char suffix;

    public Monster(String name, int hp, char suffix) {
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }

    public final boolean isAlive() {
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void showStatus(){
        System.out.println(this.getName() + this.suffix + ":HP" + this.getHp());
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

    public char getSuffix(){
        return suffix;
    }
}
