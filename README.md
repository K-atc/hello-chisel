Chisel3をお試しするリポジトリ
====

オリジナル：https://github.com/freechipsproject/chisel-template

以下のモジュールを追加しました。

* Lチカ：`main.scala.blink`

事の顛末はブログにて。

http://katc.hateblo.jp/entry/2019/06/02/173902


ビルド方法
----
### Lチカ
```
sbt 'test:runMain blink.BlinkMain --target-dir build --top-name Blink'
```