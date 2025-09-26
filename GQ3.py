import tkinter as tk
from tkinter import messagebox
def convertir():
    entrada = numero_entry.get()
    base = base_var.get()
    try:
        if base == "Entero":
            valor = int(entrada)
        elif base == "Binario":
            valor = int(entrada, 2)
        elif base == "Hexadecimal":
            valor = int(entrada, 16)
        else:
            messagebox.showerror("Error", "Selecciona una base válida")
            return
        resultado_binario.set(bin(valor)[2:])
        resultado_entero.set(str(valor))
        resultado_hex.set(hex(valor)[2:].upper())
    except ValueError:
        messagebox.showerror("Error", "Número inválido para la base seleccionada")
ventana = tk.Tk()
ventana.title("Convertidor de Bases Numéricas")
ventana.geometry("400x350")
ventana.configure(bg="#f0f0f0")
tk.Label(ventana, text="Conversor de Bases", font=("Arial", 16, "bold"), bg="#f0f0f0").pack(pady=10)
tk.Label(ventana, text="Ingresa un número:", font=("Arial", 12), bg="#f0f0f0").pack()
numero_entry = tk.Entry(ventana, font=("Arial", 12))
numero_entry.pack(pady=5)
base_var = tk.StringVar(value="Entero")
tk.Label(ventana, text="Base de entrada:", font=("Arial", 12), bg="#f0f0f0").pack()
tk.OptionMenu(ventana, base_var, "Entero", "Binario", "Hexadecimal").pack(pady=5)
tk.Button(ventana, text="Convertir", font=("Arial", 12, "bold"), bg="#4CAF50", fg="white", command=convertir).pack(pady=10)
resultado_binario = tk.StringVar()
resultado_entero = tk.StringVar()
resultado_hex = tk.StringVar()
tk.Label(ventana, text="Binario:", font=("Arial", 12), bg="#f0f0f0").pack()
tk.Label(ventana, textvariable=resultado_binario, font=("Arial", 12, "bold"), bg="#f0f0f0", fg="blue").pack()
tk.Label(ventana, text="Entero:", font=("Arial", 12), bg="#f0f0f0").pack()
tk.Label(ventana, textvariable=resultado_entero, font=("Arial", 12, "bold"), bg="#f0f0f0", fg="green").pack()
tk.Label(ventana, text="Hexadecimal:", font=("Arial", 12), bg="#f0f0f0").pack()
tk.Label(ventana, textvariable=resultado_hex, font=("Arial", 12, "bold"), bg="#f0f0f0", fg="purple").pack()
ventana.mainloop()
