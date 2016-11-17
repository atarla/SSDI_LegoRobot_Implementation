public class TurnOff implements Command {

  IRobot bot;

  public TurnOff(IRobot bot){
    this.bot = bot;
  }

  public void execute() {
    bot.turnOff();
  }

}