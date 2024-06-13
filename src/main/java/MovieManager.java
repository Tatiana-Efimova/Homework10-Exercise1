public class MovieManager {
    private String[] setOfMovies = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }


    public void addMovie(String movie) {
        String[] tmp = new String[setOfMovies.length + 1];
        for (int i = 0; i < setOfMovies.length; i++) {
            tmp[i] = setOfMovies[i];
        }
        tmp[tmp.length - 1] = movie;
        setOfMovies = tmp;
    }

    public String[] findAll() {
        return setOfMovies;
    }

    public String[] findLast() {
        int resultLength;
        if (setOfMovies.length < limit) {
            resultLength = setOfMovies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = setOfMovies[setOfMovies.length - 1 - i];
        }
        return tmp;
    }

}
