import tkinter as tk
from tkinter import simpledialog
import random


reglas_victoria = {
    'tijera': ['papel', 'lagarto'],
    'papel': ['piedra', 'spock'],
    'piedra': ['lagarto', 'tijera'],
    'lagarto': ['spock', 'papel'],
    'spock': ['tijera', 'piedra']
}

opciones = list(reglas_victoria.keys())

ventana = tk.Tk()
ventana.title("Piedra, Papel, Tijera, Lagarto, Spock")
ventana.geometry("400x400")
ventana.config(bg="#f0f0f0")


max_rondas = simpledialog.askinteger("Número de rondas",
                                     "¿Cuántas rondas quieres jugar?",
                                     minvalue=1, maxvalue=10,
                                     parent=ventana)
if max_rondas is None:
    ventana.destroy()
    exit()

puntaje_jugador = 0
puntaje_pc = 0
rondas_jugadas = 0

lbl_resultado = tk.Label(ventana, text="Elige tu opción", font=("Arial", 14), bg="#f0f0f0")
lbl_resultado.pack(pady=20)

lbl_marcador = tk.Label(ventana, text="Jugador: 0 | PC: 0", font=("Arial", 12), bg="#f0f0f0")
lbl_marcador.pack(pady=10)

def determinar_ganador(eleccion_jugador, eleccion_pc):
    global puntaje_jugador, puntaje_pc, rondas_jugadas

    if eleccion_jugador == eleccion_pc:
        resultado = f"Empate: ambos eligieron {eleccion_jugador.capitalize()}"
    elif eleccion_pc in reglas_victoria[eleccion_jugador]:
        resultado = f"Ganaste: {eleccion_jugador.capitalize()} vence a {eleccion_pc.capitalize()}"
        puntaje_jugador += 1
    else:
        resultado = f"Perdiste: {eleccion_pc.capitalize()} vence a {eleccion_jugador.capitalize()}"
        puntaje_pc += 1

    rondas_jugadas += 1
    lbl_resultado.config(text=resultado)
    lbl_marcador.config(text=f"Jugador: {puntaje_jugador} | PC: {puntaje_pc}")

    if rondas_jugadas >= max_rondas:
        finalizar_juego()

def jugar(eleccion):
    eleccion_pc = random.choice(opciones)
    determinar_ganador(eleccion, eleccion_pc)

def mostrar_mensaje_final(texto, color, emoji):
    """Crea una ventana emergente personalizada con el resultado final"""
    popup = tk.Toplevel(ventana)
    popup.title("Resultado Final")
    popup.geometry("300x200")
    popup.config(bg="#ffffff")

    tk.Label(popup, text=emoji, font=("Arial", 40), fg=color, bg="#ffffff").pack(pady=10)
    tk.Label(popup, text=texto, font=("Arial", 20, "bold"), fg=color, bg="#ffffff").pack(pady=10)

    tk.Button(popup, text="Cerrar", font=("Arial", 14), bg=color, fg="white",
              command=ventana.quit).pack(pady=10)

def finalizar_juego():
    if puntaje_jugador > puntaje_pc:
        mostrar_mensaje_final("¡GANASTE! 😃", "green", "😊")
    elif puntaje_pc > puntaje_jugador:
        mostrar_mensaje_final("Perdiste 😢", "red", "😔")
    else:
        mostrar_mensaje_final("¡EMPATE! 🤝", "blue", "😐")

frame_botones = tk.Frame(ventana, bg="#f0f0f0")
frame_botones.pack(pady=20)

for opcion in opciones:
    tk.Button(frame_botones, text=opcion.capitalize(), width=10, height=2,
              command=lambda o=opcion: jugar(o)).pack(side=tk.LEFT, padx=5)

ventana.mainloop()
