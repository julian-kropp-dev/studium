package UB08.Aufgabe1;

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

    public Star[] getMagnitudeRange(double low, double high) {
        int c = 0;
        for (Star star : db) {
            if (star.apperentMagnitude() >= low && star.apperentMagnitude() <= high) {
                c++; // Hä, wieso kein java?
            }
        }
        Star[] result = new Star[c];
        int i = 0;
        for (Star star : db) {
            if (star.apperentMagnitude() >= low && star.apperentMagnitude() <= high) {
                result[i] = star;
                i++;
            }
        }
        return result;
    }

    public Star[] db() {
        return db;
    }
}
