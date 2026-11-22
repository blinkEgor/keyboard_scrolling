# Keyboard Scrolling

A lightweight client-side Fabric mod for **Minecraft 1.21.11** that lets you scroll through your hotbar using customizable keyboard keys—no mouse wheel required.

## Features

* **Keyboard Hotbar Scrolling:** Cycle through hotbar slots (`1–9`) with a single key press.
* **Directional Scrolling:** Scroll right normally, or hold `Shift` (or use a second keybind) to scroll left.
* **Fully Configurable:** Customize your keybinds directly in **Options → Controls → Key Binds** under the **Keyboard Scrolling** category.
* **Client-Side Only:** Works on any vanilla or modded server without needing to be installed on the server.

## Requirements

* **Minecraft:** `1.21.11`
* **Mod Loader:** [Fabric Loader](https://fabricmc.net/) (`0.18.1` or higher)
* **Dependency:** [Fabric API](https://modrinth.com/mod/fabric-api)

## Installation

1. Install **Fabric Loader** for Minecraft `1.21.11`.
2. Download **Fabric API** and this mod's `.jar` file.
3. Place both `.jar` files into your `.minecraft/mods` folder.
4. Launch the game and configure your keys in **Options → Controls → Key Binds**.

## Building from Source

For IDE setup instructions, see the [Fabric Documentation](https://docs.fabricmc.net/develop/getting-started/creating-a-project#setting-up).

```bash
./gradlew build
```

The compiled mod `.jar` will be generated in `build/libs/`.

## License

This project is licensed under the **CC0-1.0** license. Feel free to use, modify, and learn from it in your own projects.
