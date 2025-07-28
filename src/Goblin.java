public class Goblin extends Monster{
    public Goblin( int hp, char suffix) {
        super("ゴブリン", hp, suffix);
    }

    public void attack(Creature target) {
        System.out.println(getName() + getSuffix() + "はナイフで切りつけた!" + target.getName() + "に8のダメージを与えた!");
        target.setHp(this.getHp()-8);
    }
}
