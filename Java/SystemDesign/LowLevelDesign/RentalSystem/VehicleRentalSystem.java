package SystemDesign.LowLevelDesign.RentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    List<Store> stores=new ArrayList<>();
    List<User> users=new ArrayList<>();

    public void addStore(Store store) {
        stores.add(store);
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeStore(int storeId) {
        stores.removeIf(store -> store.storeId == storeId);
    }

    public Store getStore(int storeId) {
        for (Store store : stores) {
            if (store.storeId == storeId) {
                return store;
            }
        }
        return null; // Store not found
    }
}
