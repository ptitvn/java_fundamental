public class PetManager extends Repository<Pet> {
    public Pet findById(String id) {
        for (Pet p : items) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
    public boolean removeById(String id) {
        Pet p = findById(id);
        if (p != null) {
            items.remove(p);
            return true;
        }
        return false;
    }
}