class B extends A
{
	int total;

	void sum()
	{
		total = i + j;	// ERROR, j is not accessible here
	}
}
