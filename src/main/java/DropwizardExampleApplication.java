import com.training.service.AccountRelationService;
import com.training.service.CustomerService;
import com.training.service.AccountService;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class DropwizardExampleApplication extends Application<Configuration> {
  public static void main(String[] args) throws Exception {
    new DropwizardExampleApplication().run(args);
  }

  @Override
  public void run(Configuration configuration, Environment environment) {
    environment.jersey().register(new Resource());
    environment.jersey().register(new CustomerService());
    environment.jersey().register(new AccountService());
    environment.jersey().register(new AccountRelationService());
  }
}
