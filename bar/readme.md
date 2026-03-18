# 마크다운
### 잘 몰라

```python
while True:
    temperature = input("섭씨면 'C' 화씨면 'F'를 입력해주세요:")
    while temperature != 'C' and temperature != 'F':
        temperature = input("잘못된 입력값입니다. 다시 입력해 팍씨:")

    if temperature == 'C':
        C = input("섭씨를 입력하세요:")
        C = int(C)
        F = 9.0 / 5.0 + C +32
        print("입력한 섭씨 %f도는 화씨 %f도 입니다."%(C,F))

    elif temperature == 'F':
        F = input("섭씨를 입력하세요:")
        F = int(F)
        C = (5 * F - 160) / 9.0
        print("입력한 섭씨 %f도는 화씨 %f도 입니다."%(F,C))

    end = input("계속 할거임? yes/no")

    while end != 'yes' and end != 'no':
        print("제대로 입력하셈 죽이기 전에")
    if end == 'no':
        break
```