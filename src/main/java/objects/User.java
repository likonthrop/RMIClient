package objects;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    //region Properties
    private int id;
    private String name;
    //endregion

    //region Constructors
    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //endregion

    //region GETSET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion

    //region Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //endregion
}
