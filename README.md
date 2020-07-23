# Phoenix-Monetary

Phoenix-Monetary inteads to be a developer friendly Money API (Java) for handling currencies & another 
monetary related data

Money values are implememented using BigDecimal. The interface 'Money' contains the BigDecimal backing the monetary value.
The API contains 2 implementations of the money class 'StdMoney' is an immutable money class. Meaning all operators will return a new instance of Money

'MutableMoney' is the mutable version of the Money interface

The 'Currency' enum contains the 3 letter iso currency codes.

```
Money amount = new StdMoney("4.55", Currency.AUD);

Currency aussieDollars = Currency.AUD

```

