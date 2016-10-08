package hu.bme.aut.gergelyszaz.BGS.core.model;

import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;

import java.util.Collections;
import java.util.Stack;

/**
 * Created by mad on 2016-03-19.
 */
public class Deck {
	public Stack<Card> cards;
	public Player owner = null;
	public String visibility;
	VariableManager vm;

	public Deck(VariableManager variableManager, Stack<Card> cards, Player owner, String visibility) {
		vm = variableManager;
		this.cards = cards;
		this.owner = owner;
		for (Card c : cards) {
			c.SetDeck(this);
		}
		this.visibility = visibility;
		UpdateTop();
	}

	public void Shuffle() {
		Collections.shuffle(cards);
		UpdateTop();
	}

	public void RemoveCard(Card card) {
		cards.remove(card);
		UpdateTop();
	}

	public void AddCard(Card card) {
		cards.push(card);
		UpdateTop();
	}

	private void UpdateTop() {
		vm.Store(this, VariableManager.CARDCOUNT, cards.size());
		if (cards.isEmpty()) return;
		vm.Store(this, VariableManager.TOP, cards.peek());
	}
}
