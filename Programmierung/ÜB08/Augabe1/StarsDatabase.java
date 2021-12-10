package ÜB08.Augabe1;

public class StarsDatabase {
    private Star[] db = {};

    public void add(Star star) {
        Star[] _db = new Star[db.length + 1];
        for (int i = 0; i < db.length; i++) {
            _db[i] = db[i];
        }
        _db[db.length] = star;
        db = _db;
    }

    public void remove(int index) {
        Star[] _db = new Star[db.length - 1];
        int j = 0;
        for (int i = 0; i < db.length; i++) {
            if (i != index) {
                _db[j] = db[i];
                j++;
            }
        }
        db = _db;
    }

    public Star get(int index) {
        return db[index];
    }

    public int size() {
        return db.length;
    }

    public Star find(String id) {
        for (Star star : db) {
            if (star.id().equals(id)) {
                return star;
            }
        }
        return null;
    }

    public Star[] db() {
        return db;
    }
}
