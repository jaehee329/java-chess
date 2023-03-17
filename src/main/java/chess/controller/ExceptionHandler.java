package chess.controller;

import java.util.function.Supplier;

import chess.view.OutputView;

public class ExceptionHandler {

	public static <T> T RetryIfThrowsException(final Supplier<T> strategy) {
		T result = null;
		while (result == null) {
			result = tryCatchStrategy(strategy, null);
		}
		return result;
	}

	public static <T> T tryCatchStrategy(final Supplier<T> strategy, T result) {
		try {
			result = strategy.get();
		} catch (Exception exception) {
			OutputView.printErrorMessage(exception.getMessage());
		}
		return result;
	}

	public static void tryCatchStrategy(final Runnable runnable) {
		try {
			runnable.run();
		} catch (IllegalArgumentException exception) {
			OutputView.printErrorMessage(exception.getMessage());
		}
	}
}
