import entites.flower.Freshness;
import entites.flower.PlantType;
import entites.flower.Stem;

/**
 *
 * Created by Kocherha Vitalii on 14.06.16.
 */
public class Plant implements Sellable {

    private PlantType plantType;
    private String naming;
    private Freshness freshness;
    private Stem stem;
    private boolean nourishmentNeed;

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public Stem getStem() {
        return stem;
    }

    public void setStem(Stem stem) {
        this.stem = stem;
    }

    public boolean isNourishmentNeed() {
        return nourishmentNeed;
    }

    public void setNourishmentNeed(boolean nourishmentNeed) {
        this.nourishmentNeed = nourishmentNeed;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plantType=" + plantType +
                ", naming='" + naming + '\'' +
                ", freshness=" + freshness +
                ", stem=" + stem +
                ", nourishmentNeed=" + nourishmentNeed +
                '}';
    }

    @Override
    public void sell() {
    }
}
