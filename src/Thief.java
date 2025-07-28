public class Thief extends Character{
    public Thief(String name,int hp) {
        super(name,hp);
    }

    public void attack(Creature target) {
        System.out.println(getName() + "素早く攻撃した!" + target.getName() + "に5のダメージを与えた!");
        target.setHp(this.getHp()-5);
    }
}