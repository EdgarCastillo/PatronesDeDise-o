Class Singleton (object):
	_instance = None

	def __new__(cls, *args, **kwargs):
		if not cls._instance:
			cls._instance = object.__new__(cls, *args, **kwargs)
		return cls._instance

Class Ave(Singleton):
	nombre = u""

a = Ave()
b = Ave()

a.nombre = u"Cuervo"
b.nombre = u"Gorrión"
a.nombre == b.nombre # True, Gorrion = Gorrion
