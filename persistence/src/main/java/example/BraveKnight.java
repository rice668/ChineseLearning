package example;

/**
 * Created by zhangminglei on 2017/1/19.
 */
public class BraveKnight implements Knight {
  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;       //<co id="co_injectedQuest"/>
  }

  public void embarkOnQuest() {
    quest.embark();
  }
}
