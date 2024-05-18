package ornek15;

public class Ornek15 {

    public static void main(String[] args) {
        // Generics çalışma

    }
}

interface IEntityRepository<T> {

    void add(T entity);

    void delete(T entity);

    void update(T entity);
}

class CustomerDal implements IEntityRepository<Customer> {

    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }

}

class PruductDal implements IEntityRepository<Customer> {

    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }

}

interface IEntity {

}

class Customer implements IEntity {

}

class Product implements IEntity {

}

class Validator {

}
