public class Slime extends Monster{
    public Slime(int hp, char suffix) {
        super("スライム", hp, suffix);
    }

    public void attack(Creature target) {
        System.out.println(getName() + getSuffix()+ "は体当たり攻撃!" + target.getName() + "に5のダメージを与えた!");
        target.setHp(this.getHp()-5);
    }
}