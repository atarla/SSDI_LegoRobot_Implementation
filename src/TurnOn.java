public class TurnOn implements Command {

  IRobot bot;

  public TurnOn(IRobot bot){
    this.bot= bot;
  }

  public void execute() {
    bot.turnOn();
  }
}
