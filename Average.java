class Average {
	
	public static float average(int[] values) {
		float total = 0;

		for (int i = 0; i < values.length; i++) {
			total = values[i] + total;
		}
		return total / values.length;
	}
}
