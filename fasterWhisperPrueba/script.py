from faster_whisper import WhisperModel

# 1. Cargamos el modelo
model = WhisperModel("base", device="cpu", compute_type="int8")

print("Procesando el audio con faster-whisper...")

# 2. Transcribimos (añadimos algunos parámetros para asegurar que lea todo)
segments, info = model.transcribe(
    "test4.wav", 
    beam_size=5,
    language="es",        # Forzamos el idioma a español para que no pierda tiempo adivinando
    vad_filter=False     # Desactivamos el filtro de silencio por si acaso se está comiendo tu voz
)

print(f"Idioma detectado: {info.language} (Probabilidad: {info.language_probability:.2f})")
print("--- Transcripción comenzada ---")

# Contamos si encuentra algún segmento
lineas_escritas = 0

for segment in segments:
    print(f"[{segment.start:.2f}s -> {segment.end:.2f}s] {segment.text}")
    lineas_escritas += 1

if lineas_escritas == 0:
    print("Aviso: No se detectó ninguna palabra en el archivo de audio.")

print("--- Fin del script ---")