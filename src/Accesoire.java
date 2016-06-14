import entites.accesorie.AccesioreType;

/**
 *
 * Created by Kocherha Vitalii on 14.06.16.
 */
public class Accesoire implements Sellable {
    private AccesioreType accesioreType;

    @Override
    public String toString() {
        return "Accesoire{" +
                "accesioreType=" + accesioreType +
                '}';
    }

    @Override
    public void sell() {
    }
}
