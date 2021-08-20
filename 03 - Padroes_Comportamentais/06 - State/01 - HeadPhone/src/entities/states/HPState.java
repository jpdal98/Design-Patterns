package entities.states;

import entities.model.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
