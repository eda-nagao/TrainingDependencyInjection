# TrainingDependencyInjection
Dagger2を使用したDI（依存性注入）を学ぶための演習問題です。

## サンプルアプリの説明
江戸幕府の将軍を表示するアプリです。

APIから将軍の名前（name）と就任した順序（index）を取得します。

画面（MainActivity）には初代、二代目、三代目まで表示されます。

## 演習１
このアプリを起動すると強制終了してしまいます。原因について考えてください。
- 実際のアプリ開発では、APIサーバが未完成だったり、問題があって繋げられないことはよくあります。

## 演習２
ShogunRepositoryMockImplクラスを完成させてください。

このクラスは、ShogunRepositoryインターフェースを実装する必要があります。

また、以下のようなデータを返すようにしてみてください。

|index|name|
|-----|----|
|0|徳川家康|
|1|徳川秀忠|
|2|徳川家光|

## 演習３
MainActivityクラスのフィールドであるrepositoryが、ShogunRepositoryImplではなくShogunRepositoryMockImplを参照するように改修してください。

## 解説
依存性注入（Dependency Injection）とは、ある処理が依存しているクラスのインスタンス（dependency）を内部で生成する代わりに、外部から注入（injection）することです。

この仕組みを利用すると、ソースコードには手を加えず、振る舞いだけを変更することが可能になります。

たとえばAPIサーバの接続先を開発フェーズによって切り替えたり、データを取得するクラスとデータを表示するクラスを別々のプログラマが開発したり、というときに便利です。

依存性注入をおこなうためのライブラリはいくつかあり、Java/Androidの場合はDagger2が一般的です。
