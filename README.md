[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/bIZQaFcG)


## Overview

คลาส `RPGCharacter` แทนตัวละครในเกมแบบ Role-Playing Game (RPG) โดยมีคุณลักษณะและเมทอดต่าง ๆ เพื่อจัดการสถานะตัวละคร เครื่องนุ่งหลัง และปฏิสัมพันธ์กับตัวละครอื่น ๆ

## Variable

1. **ชื่อ (name):** แทนชื่อของตัวละคร
   - ประเภท: String

2. **เลเวล (level):** แทนระดับของตัวละคร
   - ประเภท: int

3. **พลังชีวิตสูงสุด (max_hp):** แทนพลังชีวิตสูงสุดของตัวละคร
   - ประเภท: int

4. **พลังชีวิต (hp):** แทนพลังชีวิตปัจจุบันของตัวละคร
   - ประเภท: int

5. **มานาสูงสุด (max_mana):** แทนพลังจิตสูงสุดของตัวละคร
   - ประเภท: int

6. **มานา (mana):** แทนพลังจิตปัจจุบันของตัวละคร
   - ประเภท: int

7. **ความเร็วพื้นฐาน (basespeed):** แทนความเร็วพื้นฐานของตัวละคร
   - ประเภท: int

8. **ความเร็ว (speed):** แทนความเร็วปัจจุบันของตัวละคร โดยคำนึงถึงระดับและไอเท็มที่สวมใส่
   - ประเภท: int

9. **ดาบที่สวมใส่ (equippedSword):** แทนดาบที่กำลังสวมใส่
   - ประเภท: Sword (คลาส)

10. **โล่ที่สวมใส่ (equippedShield):** แทนโล่ที่กำลังสวมใส่
    - ประเภท: Shield (คลาส)

## Constructor

### `public RPGCharacter()`

- กำหนดค่าเริ่มต้นของตัวละคร
- ตั้งค่าชื่อเป็น "You," ระดับเป็น 1, max_hp เป็น 100, hp เป็น max_hp, max_mana เป็น 50, mana เป็น max_mana, basespeed เป็น 10, และ speed เป็น 10.

##  Method

### `public void setname(String name)`

- ตั้งชื่อของตัวละคร.

### `public void levelup()`

- เพิ่มระดับของตัวละคร
- ปรับค่า max_hp, max_mana, และ speed ขึ้นอยู่กับระดับ

### `public void equipSword(Sword sword)`

- สวมใส่ดาบให้กับตัวละคร
- ถอดดาบที่สวมใส่อยู่ (หากมี)
- ลดความเร็วลง 5
- พิมพ์ข้อความแจ้งว่าได้สวมใส่ดาบ

### `public void unequipSword()`

- ถอดดาบที่สวมใส่อยู่
- คืนความเร็วให้เหมือนเดิม

### `public void equipShield(Shield shield)`

- สวมใส่โล่ให้กับตัวละคร
- ถอดโล่ที่สวมใส่อยู่ (หากมี)
- พิมพ์ข้อความแจ้งว่าได้สวมใส่โล่

### `public void unequipShield()`

- ถอดโล่ที่สวมใส่อยู่

### `private int calculator_attack()`

- คำนวณพลังโจมตีของตัวละครโดยใช้ดาบที่สวมใส่
- คืนค่า 0 หากไม่