package order.t1;

public class ManTools<T> {

    public T work;
    public ManTools(T t){
        this.work = t;
    }

    public T getWork() {
        return work;
    }

    public void setWork(T work) {
        this.work = work;
    }
}
