import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class Test {

	public static void main(String[] args) {
		String accessToken = "EAACEdEose0cBAFAdhFhf8MHWlzcymBBZCpkzleGJZAjSNRMCqgDzkj0KcQt2fZAPsY96plYecCxY5XilXrM9qW82j0lnGP5bddZBOuRb9mnBYbfYLYn7djJlahgayGwQrLWvR7uDhnvHtZCBYwr7g4ggbIfmQVxZBDJRd4PZBFRJN553mJBihKvog1Oe5sMYly99ZAhfiV52iQZDZD";
		FacebookClient fbClient = new DefaultFacebookClient(accessToken);
		User me = fbClient.fetchObject("me", User.class);
		me.setFirstName("bunchie");
		System.out.println(me.getName());
	}

}
