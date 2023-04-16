package moviesreviewsvc.exeception;

public class ReviewDataException extends RuntimeException {
  private final String message;
  public ReviewDataException(String message){
    super(message);
    this.message=message;
  }

}
