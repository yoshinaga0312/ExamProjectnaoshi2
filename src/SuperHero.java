public class SuperHero extends Hero{
    public SuperHero(Hero h) {
        super(h.getName(),h.getHp(),h.getWeapon());
    }

    public void attack(Creature target) {
        System.out.println(getName() + "は" + getWeapon() + "で攻撃!" + target.getName() + "に25のダメージを与えた!");
        target.setHp(target.getHp()-25);
    }
}