package pl.kognitywistyka.ppa2021.mock;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;

public class Adder {
	
	protected BigDecimal first;
	protected BigDecimal second;
	
	public BigDecimal getFirst() {
		return first;
	}
	
	public void setFirst(BigDecimal first) {
		this.first = first;
	}
	
	public BigDecimal getSecond() {
		return second;
	}
	
	public void setSecond(BigDecimal second) {
		this.second = second;
	}
	
	public void readFirst(String input) {
		try {
			setFirst(new BigDecimal(input));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid number: " + input);
		}
	}
	
	public void readSecond(String input) {
		try {
			setSecond(new BigDecimal(input));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid number: " + input);
		}
	}
	
	public BigDecimal add() {
		return Objects.requireNonNull(first, "First argument must not be empty").add(
			Objects.requireNonNull(second, "Second argument must not be empty"));
	}

}
